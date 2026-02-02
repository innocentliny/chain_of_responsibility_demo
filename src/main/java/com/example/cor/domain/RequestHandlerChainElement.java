package com.example.cor.domain;

public interface RequestHandlerChainElement extends ChainElement<RequestHandlerChainElement>, Handler<Request> {
}
