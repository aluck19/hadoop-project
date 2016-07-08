package Service;

import Model.HVAC;

import java.util.List;

/**
 *  Created by abhishek on 7/8/16.
 */
public class DataService{

    public List<HVAC> fetchData(int buildingId){

        FetchService fetchService = new FetchService();
        fetchService.setData(buildingId);
        return fetchService.getProcessedData();
    }


    public List<HVAC> fetchData(){
        FetchService fetchService = new FetchService();
        fetchService.setData();
        return fetchService.getProcessedData();
    }

}
