1. How it works
   RedemptionEventPublisher
   Publishes: Redemption completed

EmailNotificationObserver
Sends a notification


AuditObserver
Records the event




When a redemption event is published, both registered observers receive it. The publisher doesn't need to know their concrete implementations.
2. Project structure
   Create these files under src/main/java/observer/:
   observer/
   ├── RedemptionEvent.java
   ├── RedemptionObserver.java
   ├── RedemptionEventPublisher.java
   ├── EmailNotificationObserver.java
   ├── AuditObserver.java
   └── Main.java


Use package observer; at the top of each file.