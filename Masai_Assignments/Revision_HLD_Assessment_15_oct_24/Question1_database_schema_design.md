### Schema definition

```sql
create table user{
    user_id INT primary key,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50)
}

create table Event{
    event_id INT primary key,
    eventTitle VARCHAR(50),
    eventDate date,
    eventStarttime  time,
    eventEndtime  time,
    calendar_id INT,
    Foreign Key (calendar_id),
}

create table Calendar{
    calendar_id INT primary key,
    user_id INT,
    created_at timestamp,
    Foreign Key (user_id),

}

```

### Partitioning strategies

- horizontal or vertical partition :
  horizontal :  
  vertical : less frequently used data should be stored in separate table

- indexing strategy :

- Sharding methods :
