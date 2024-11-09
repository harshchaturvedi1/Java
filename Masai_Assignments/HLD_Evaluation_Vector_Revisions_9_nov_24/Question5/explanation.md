1. User orders the order and
2. create a new order event is consumed by the order service and a new event is published for order placed

3. order placed event is cosumed by payment service which tries to complete the payment

- 1.  if payment success than payment service creates event for inventory service to update the inventory
- 2.  if payment fails then another event is published for order service to rollback the order placed

4. inventory service updates the inventory if items are present

- 1. if inventory service successfully updates inventory than new event is published for shippping service to start the order process
- 2. if inventory service fails then another event is published for payment service to rollback the payment and order plaed
