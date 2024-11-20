package com.almir.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class WalletRequest {
    private UUID walletId;
    private OperationType operationType;
    private Long amount;
}
