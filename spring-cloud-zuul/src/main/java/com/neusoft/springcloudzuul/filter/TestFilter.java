package com.neusoft.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TestFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest  request = context.getRequest();
        String remoteHost = request.getRemoteHost();
        String path = request.getContextPath();
        //request.getSession().getId();
        LOGGER.info("remoteHost is "+remoteHost);
        return null;
    }
}
