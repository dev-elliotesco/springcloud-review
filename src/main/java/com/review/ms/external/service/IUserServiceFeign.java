package com.review.ms.external.service;

import com.review.ms.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-MS/api/users")
public interface IUserServiceFeign {

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> getUserById(@PathVariable String id);

}
