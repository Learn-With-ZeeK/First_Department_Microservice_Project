package com.zeek.userserviceA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zeek.userserviceA.VO.Department;
import com.zeek.userserviceA.VO.ResponseTemplateVO;
import com.zeek.userserviceA.entity.User;
import com.zeek.userserviceA.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private RestTemplate restTemplate;

	    public User saveUser(User user) {

	        return userRepository.save(user);
	    }

	    public ResponseTemplateVO getUserWithDepartment(Long userId) {
	        ResponseTemplateVO vo = new ResponseTemplateVO();
	        User user = userRepository.findByUserId(userId);

	        Department department =
	                restTemplate.getForObject("http://localhost:8080/departments/" + user.getDepartmentId()
	                        ,Department.class);

	        vo.setUser(user);
	        vo.setDepartment(department);

	        return  vo;
	    }
	}

