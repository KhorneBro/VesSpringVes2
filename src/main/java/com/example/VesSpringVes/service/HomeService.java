package com.example.VesSpringVes.service;

import com.example.VesSpringVes.entity.HomeEntity;
import com.example.VesSpringVes.entity.UsersEntity;
import com.example.VesSpringVes.repository.HomeRepository;
import com.example.VesSpringVes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private HomeRepository homeRepository;

    public void addHome(Integer userId ,HomeEntity homeEntity){
        UsersEntity usersEntity = userRepository.findById(userId).orElse(null);
        homeEntity.setUsersEntity(usersEntity);
        homeRepository.save(homeEntity);
    }

    public List<HomeEntity> findAll(){
        return homeRepository.findAll();
    }

    public HomeEntity findById(Integer usersId){
        return homeRepository.findById(usersId).orElse(null);
    }

    public void deleteHome(Integer id){
        homeRepository.deleteById(id);
    }

    public HomeEntity editHome(HomeEntity homeEntity){
        return homeRepository.save(homeEntity);
    }
}
