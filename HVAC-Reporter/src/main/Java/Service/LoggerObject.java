package Service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *  Created by abhishek on 7/8/16.
 */
public class LoggerObject {
    static Logger logger = null;
    static FileHandler fh;


    public static Logger getLoggerObject(){

        if(logger==null) {
            logger = Logger.getLogger("HVAC-Reporter-Log");Logger.getLogger("HVAC-Reporter-Log");
            try {


                fh = new FileHandler("/home/abhishek/HVACDataAnalysis-master/HVACDataAnalysis-master/HVAC-Reporter/log/systemLog.log");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            return logger;
        }else{
            return logger;
        }
    }
}
