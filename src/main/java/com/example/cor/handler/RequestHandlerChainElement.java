package com.example.cor.handler;

import com.example.cor.domain.Request;

public interface RequestHandlerChainElement extends ChainElement<RequestHandlerChainElement>, Handler<Request> {
}
