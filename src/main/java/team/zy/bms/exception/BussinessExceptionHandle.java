package team.zy.bms.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import team.zy.bms.constants.DataConstants;

public class BussinessExceptionHandle implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex) {

        ex.printStackTrace();

        BussinessException BussinessException = null;
        
        //如果抛出的是系统自定义异常则直接转换
        if(ex instanceof BussinessException){
            BussinessException = (BussinessException)ex;
        }else{
            //如果抛出的不是系统自定义异常则重新构造一个系统错误异常。
            BussinessException = new BussinessException();
        }
        
        JSONObject json = new JSONObject();
        
        json.put(DataConstants.responseCode, BussinessException.getExceptionCode());
        json.put(DataConstants.responseMsg, BussinessException.getExceptionMsg());
        
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        out.println(json);  
        out.flush();  
        out.close(); 

        
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.addObject(DataConstants.responseCode, BussinessException.getExceptionCode());
        modelAndView.addObject(DataConstants.responseMsg, BussinessException.getExceptionMsg());
        modelAndView.setViewName("error/error");

        return modelAndView;
    }


}