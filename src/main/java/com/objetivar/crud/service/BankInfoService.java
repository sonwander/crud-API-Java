package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.repository.BankInfoRepository;
import com.objetivar.crud.model.BankInfo;

import java.util.List;

@Service
public class BankInfoService {
    private final BankInfoRepository bankInfoRepository;

    @Autowired
    public BankInfoService(BankInfoRepository bankInfoRepository) {
        this.bankInfoRepository = bankInfoRepository;
    }

    public BankInfo createBankInfo(BankInfo bankInfo) {
        return bankInfoRepository.save(bankInfo);
    }

    public BankInfo getBankInfoById(Long id) {
        return bankInfoRepository.findById(id).orElse(null);
    }

    public List<BankInfo> getAllBankInfo() {
        return bankInfoRepository.findAll();
    }

    public void updateBankInfo(Long id, BankInfo updatedBankInfo) {
        BankInfo existingBankInfo = bankInfoRepository.findById(id).orElse(null);
        if (existingBankInfo != null) {
            existingBankInfo.setBranchNumber(updatedBankInfo.getBranchNumber());
            existingBankInfo.setBankName(updatedBankInfo.getBankName());
            existingBankInfo.setAccountNumber(updatedBankInfo.getAccountNumber());
            existingBankInfo.setAccountOperation(updatedBankInfo.getAccountOperation());
            bankInfoRepository.save(existingBankInfo);
        }
    }

    public void deleteBankInfo(Long id) {
        bankInfoRepository.deleteById(id);
    }
}
