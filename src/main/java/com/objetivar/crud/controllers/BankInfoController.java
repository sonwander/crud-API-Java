package com.objetivar.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.objetivar.crud.service.BankInfoService;
import com.objetivar.crud.model.BankInfo;

import java.util.List;

@RestController
@RequestMapping("/bank-info")
public class BankInfoController {
    private final BankInfoService bankInfoService;

    @Autowired
    public BankInfoController(BankInfoService bankInfoService) {
        this.bankInfoService = bankInfoService;
    }

    @PostMapping
    public BankInfo createBankInfo(@RequestBody BankInfo bankInfo) {
        return bankInfoService.createBankInfo(bankInfo);
    }

    @GetMapping("/{id}")
    public BankInfo getBankInfo(@PathVariable Long id) {
        return bankInfoService.getBankInfoById(id);
    }

    @GetMapping
    public List<BankInfo> getAllBankInfo() {
        return bankInfoService.getAllBankInfo();
    }

    @PutMapping("/{id}")
    public void updateBankInfo(@PathVariable Long id, @RequestBody BankInfo updatedBankInfo) {
        bankInfoService.updateBankInfo(id, updatedBankInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteBankInfo(@PathVariable Long id) {
        bankInfoService.deleteBankInfo(id);
    }
}
