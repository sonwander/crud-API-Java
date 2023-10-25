package com.objetivar.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.objetivar.crud.service.HiringInformationService;
import com.objetivar.crud.model.HiringInformation;

import java.util.List;

@RestController
@RequestMapping("/hiring-information")
public class HiringInformationController {
    private final HiringInformationService hiringInformationService;

    @Autowired
    public HiringInformationController(HiringInformationService hiringInformationService) {
        this.hiringInformationService = hiringInformationService;
    }

    @PostMapping
    public HiringInformation createHiringInformation(@RequestBody HiringInformation hiringInformation) {
        return hiringInformationService.createHiringInformation(hiringInformation);
    }

    @GetMapping("/{registrationId}")
    public HiringInformation getHiringInformationById(@PathVariable Long registrationId) {
        return hiringInformationService.getHiringInformationById(registrationId);
    }

    @GetMapping
    public List<HiringInformation> getAllHiringInformation() {
        return hiringInformationService.getAllHiringInformation();
    }

    @PutMapping("/{registrationId}")
    public void updateHiringInformation(@PathVariable Long registrationId, @RequestBody HiringInformation updatedHiringInformation) {
        hiringInformationService.updateHiringInformation(registrationId, updatedHiringInformation);
    }

    @DeleteMapping("/{registrationId}")
    public void deleteHiringInformation(@PathVariable Long registrationId) {
        hiringInformationService.deleteHiringInformation(registrationId);
    }
}
