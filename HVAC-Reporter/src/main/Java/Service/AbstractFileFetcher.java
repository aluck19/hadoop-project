package Service;

import java.io.File;

/**
 * Created by abhishek on 7/8/16.
 */

public abstract class AbstractFileFetcher implements FileFetcher{

    protected File inputFile = null;

    public File getFile(String classifier) {
        return inputFile;
    }
}
