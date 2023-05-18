package com.store.car.controller;

import com.store.car.dto.CarPostDTO;
import com.store.car.service.CarPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class CarPostController {

    @Autowired
    private CarPostService carPostService;

    @GetMapping(value = "/cars")
    public ResponseEntity<List<CarPostDTO>> getCarSales() {
        return ResponseEntity.status(HttpStatus.FOUND).body(carPostService.getCarSales());
    }

    @PutMapping(value = "/car/{id}")
    public ResponseEntity changeCarSale(
            @RequestBody CarPostDTO carPostDTO, @PathVariable("id") String id) {
        carPostService.changeCarSale(carPostDTO, Long.valueOf(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/car/{id}")
    public ResponseEntity deleteCarSale(@PathVariable("id") String id) {
        carPostService.removeCarSale(Long.valueOf(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
