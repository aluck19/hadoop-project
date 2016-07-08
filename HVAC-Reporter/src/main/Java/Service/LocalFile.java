package Service;

import java.io.File;

/**
 *  Created by abhishek on 7/8/16.
 */
public class LocalFile extends AbstractFileFetcher {

    @Override
    public File getFile(String classifier) {
        if(classifier.equalsIgnoreCase("noDrill")) {
            inputFile = new File("/home/abhishek/HVACDataAnalysis-master/HVACDataAnalysis-master/HVAC-Reporter/data/secondResult.csv");
        }else{
            inputFile = new File("/home/abhishek/HVACDataAnalysis-master/HVACDataAnalysis-master/HVAC-Reporter/data/firstResult.csv");
        }
        return inputFile;
    }
}
