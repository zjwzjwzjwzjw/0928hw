
package util;



import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SameUrlDataInterceptor  extends HandlerInterceptorAdapter {
    /*@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            SameUrlData annotation = method.getAnnotation(SameUrlData.class);
            if (annotation != null) {
                if (repeatDataValidator(request)) {//����ظ���ͬ����
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        } else {
            return super.preHandle(request, response, handler);
        }
    }
    public boolean repeatDataValidator(HttpServletRequest httpServletRequest)	{
        String params=new ObjectMapper.writeValueAsString(httpServletRequest.getParameterMap());
        String url=httpServletRequest.getRequestURI();
        Map<String,String> map=new HashMap<String,String>();
        map.put(url, params);
        String nowUrlParams=map.toString();//
        Object preUrlParams=httpServletRequest.getSession().getAttribute("repeatData");
        if(preUrlParams==null){//�����һ������Ϊnull,��ʾ��û�з���ҳ��
         httpServletRequest.getSession().setAttribute("repeatData", nowUrlParams);
        return false;
        } else{//�����Ѿ����ʹ�ҳ��
            if(preUrlParams.toString().equals(nowUrlParams)){//����ϴ�url+���ݺͱ���url+������ͬ�����ʾ�Ǹ��������
                return true;
            } else{//����ϴ� url+���� �ͱ���url�����ݲ�ͬ�������ظ��ύ
    			httpServletRequest.getSession().setAttribute("repeatData", nowUrlParams);
                return false;
            }
        }
    }*/
}
