# Chain of responsibility demo
Simplified Chain of responsibility design pattern demo using spring boot 4.

I use this pattern to the system I refactored.
It will handle the request in a chain.
The chain is constructed by three handlers.
Each handler processes the request **AND** passes it to the next handler, and will stop if the next handler is null.

This application will call a handler service to start the chain with a fake request every 10 seconds.

Output example:
```text
Handler 1 handled request_1770015006205
Handler 2 handled request_1770015006205
Handler 3 handled request_1770015006205
Handler 1 handled request_1770015016206
Handler 2 handled request_1770015016206
Handler 3 handled request_1770015016206
```