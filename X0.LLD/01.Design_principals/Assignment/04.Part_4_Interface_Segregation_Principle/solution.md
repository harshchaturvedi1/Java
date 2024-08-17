```java
class HelloWorld{
    public static void main(String[] args){    }
}

interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

interface Meetable{
    void attendMeetings();
}

class Developer implements Workable,Eatable,Meetable{
    // @override
    public void work(){};
    // @override
    public void eat(){};
    // @override
    public void attendMeetings(){};
}

class Manager implements Workable, Meetable{
    // @override
    public void work(){};
    // @override
    public void attendMeetings(){};
}
```
