package com.grocery.shopping.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.grocery.shopping.Pojo.ServiceListPojo;
import com.grocery.shopping.Reposetry.ServiceList_Repo;

import java.util.List;

public class ServiceViewModel extends ViewModel {

    ServiceList_Repo serviceList_repo;


    public ServiceViewModel(){
        serviceList_repo= new ServiceList_Repo();

    }

    public MutableLiveData<List<ServiceListPojo>> getAllService(Integer ID){
        return  serviceList_repo.getService_list(ID);
    }
}
