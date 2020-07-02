package com.itheima.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testFileUpload")
    public String testFileUpload(MultipartFile upload, Model model) throws Exception {
        System.out.println("执行了testFileUpload方法");
        /**
         * 传统上传文件
         */
        /*//1.上传的位置,获取到项目根目录下的uploads文件夹绝对路径
        String path = request.getSession().getServletContext().getRealPath("/uploads");

        //创建file对象
        File file =new File(path);

        //判断是否存在
        if (!file.exists()){
            file.mkdirs();
        }

        //2.创建servletFileUpload和磁盘文件向工厂
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);

        //3.解析request,遍历fileItem对象

        List<FileItem> list=fileUpload.parseRequest(request);

        //遍历,获取每一个文件项的对象
        for (FileItem fileItem : list) {
            //判断当前fileItem是否是文件项
            if (fileItem.isFormField()){
                //说明是普通的表单,文本框,下拉框等
            }else{
                //文件上传项,fileItem
                //获取文件的名称
                String filename = fileItem.getName();
                //生成唯一标识
                String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
                filename=uuid+"_"+filename;
                //:上传文件,调用write()方法
                fileItem.write(new File(file,filename));
                //删除临时文件
                fileItem.delete();
            }
        }

        return "success";*/
        /**
         * 使用springmvc上传文件
         */

        /*//1.上传的位置,获取到项目根目录下的uploads文件夹绝对路径
        String path = "http://localhost:9090/spring_day02_uploadserver/uploads/";

        //创建file对象
        File file =new File(path);

        //判断是否存在
        if (!file.exists()){
            file.mkdirs();
        }

        //获取文件的名称
        String filename = upload.getOriginalFilename();
        //生成唯一标识
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        filename=uuid+"_"+filename;

        //使用upload直接上传文件
        upload.transferTo(new File(file,filename));
        return "success";*/

        /**
         * 跨服务器上传文件
         */

        String path="http://localhost:9090/spring_day02_uploadserver/uploads/";

        //获取文件的名称
        String filename = upload.getOriginalFilename();
        //生成唯一标识
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        filename=uuid+"_"+filename;

        //2.上传文件
        //创建客户端对象
        Client client = Client.create();
        filename=path+filename;

        //连接图片服务器
        WebResource resource = client.resource(filename);
        //把文件上传到图片服务器上
        resource.put(upload.getBytes());

        //在页面上显示图片

        model.addAttribute("filename",filename);
        return "success";
    }
}
