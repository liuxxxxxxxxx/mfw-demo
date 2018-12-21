package com.qf.web;

import com.qf.pojo.vo.AuthorVo;
import com.qf.pojo.po.UserAuthor;
import com.qf.pojo.po.UserInfo;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Random;


//在spring-mvc已经配置扫描
@Controller
public class UserAction {

    //    注入属性
    @Autowired
    private UserService userService;

    //无用
    @GetMapping("user")
    public String personal(){
        return"personal";
    }


    //普通用户登录
    @PostMapping("user")
    @ResponseBody
    public UserInfo login(AuthorVo data) {
        return userService.login(data);

    }
    //普通用户注册
    @PutMapping("user")
    @ResponseBody
    public int register(UserAuthor data) {
        return userService.register(data);
    }

    //    ********************
//    @GetMapping("user/auto")
    public void register() {
        for(int i = 0; i<1000; i++){

        UserAuthor userAuthor = new UserAuthor();
        userAuthor.setAuthorType("tel");
        Random random = new Random();
        String tel = "1" + (random.nextInt(7) + 3);
        for (int j = 0; j < 9; j++) {
            tel += random.nextInt(10);
        }
        userAuthor.setTypeId(tel);
        userAuthor.setCommand("000000");
        userService.register(userAuthor);
        }
    }


    /**
     * * 1.添加依赖  commons-fileupload
     * * 2.spring-mvc.xml 上传解析器
     * * 3.添加表单 enctype
     * * 4.添加action MultipartFile
     * * 5.测试
     *
     * @param request
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/uimage")
    public String upload(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
//            获取路径
            String path = request.getServletContext().getRealPath("/file/");
//            获取原始图片的名称
            String filename = file.getOriginalFilename();
//            获取File对象
            File file1 = new File(path, filename);

            if (!file1.getParentFile().exists()) {
                file1.getParentFile().mkdirs();
            }

            file.transferTo(new File(path + File.separator + filename));
        }
        return "uimage";
    }
}
