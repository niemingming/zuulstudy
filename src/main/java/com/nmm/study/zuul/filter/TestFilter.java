package com.nmm.study.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * @description 从测试看，只要Filter在Spring容器中，即可生效。
 * @date 2017/12/20
 * @author Niemingming
 */
@Component
public class TestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre"; //前置拦截，还有route，post,error
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("??");
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();//获取请求容器
        requestContext.setSendZuulResponse(true);//允许发送
        requestContext.setResponseStatusCode(200);
        return null;
    }
}
