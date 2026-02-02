package com.example.cor.handler;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.cor.domain.AbstractRequestHandlerChainElement;
import com.example.cor.domain.Request;

@Component
@Order(3)
public class RequestHandler3 extends AbstractRequestHandlerChainElement {
    @Override
    public void doHandle(Request req) {
        // do nothing
    }

    @Override
    public String getName() {
        return "Handler 3";
    }
}
