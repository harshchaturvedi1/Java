```java
interface JobAdder{
    void addJobToPrinter(String jobId);
}

interface JobProcessor{
    void processJobToPrinter(String jobId);
}

interface Printer{
    void print(String jobId);
}

class PrinterSpooler implements JobAdder,JobProcessor,Printer{
    private static  PrinterSpooler  instance;

    // private constructor so that object can't be created
    private PrinterSpooler(){};

    public static PrinterSpooler getInstance(){
        if(instance==null){
             synchronized (PrinterSpooler.class) {
                if (instance == null) {
                    instance = new PrinterSpooler();
                }
            }
        }
        return instance;
    }

    public void addJobToPrinter(String jobId){
        System.out.println("job added to printer #" + jobId);
    }

    public void processJobToPrinter(String jobId){
        System.out.println("job processing to printer #" + jobId);
    }

    public void print(String jobId){
        System.out.println("job printing #" + jobId);
    }

}

// add, process, and view print jobs
public class Main
{
    public static void main(String[] args) {
        PrinterSpooler printer = PrinterSpooler.getInstance();

        printer.addJobToPrinter("123swe2");
        printer.processJobToPrinter("123swe2");
        printer.print("123swe2");
    }
}
```
