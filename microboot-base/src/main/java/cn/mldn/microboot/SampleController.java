package cn.mldn.microboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String home() {
        return "www.mldn.cn";
    }

    @RequestMapping("/echo")
    public String echo(String msg) {
        return msg;
    }

    @RequestMapping("/object")
    public void object(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("客戶端IP地址：" + request.getRemoteAddr());
        System.out.println("本地地址：" + request.getLocalAddr());
        System.out.println("客户端响应编码：" + response.getCharacterEncoding());
        System.out.println("获取sessionID：" + request.getSession().getId());
        System.out.println("获取真实路径：" + request.getServletContext().getRealPath("/upload/"));
    }
}
