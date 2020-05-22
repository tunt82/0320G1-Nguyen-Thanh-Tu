package section3_lop_va_doi_tuong_trong_java.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StopWatch {
    private long startTime;
    private long endTime;
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void  stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public StopWatch() {
    }

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.startTime);
        int cout=0;
        for(int i=0; i<1000000;i++){
            cout++;
        }
        stopWatch.stop();
        System.out.println(stopWatch.endTime);
        System.out.println(stopWatch.getElapsedTime());




    }
}
