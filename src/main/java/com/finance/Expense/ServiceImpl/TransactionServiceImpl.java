package com.finance.Expense.ServiceImpl;




//@Service
public class TransactionServiceImpl  {

    // @Autowired(required = false)
    // private TransactionRepository transactionRepository;

    // @Override
    // public List<TransactionDTO> getAllTransactions() throws TransactionNotFoundException {
    //     List<TransactionEntity> transEntity = transactionRepository.findAll();
    //     if (transEntity.isEmpty()) {
    //         throw new TransactionNotFoundException("No transactions found");
    //     }
    //     return transEntity.stream().map(transactionEntity -> {
    //         return TransactionDTO.builder()
    //             .amount(transactionEntity.getAmount())
    //             .date(transactionEntity.getDate())
    //             .description(transactionEntity.getDescription())
    //             .id(transactionEntity.getId())
    //             .build();
    //     }).collect(Collectors.toList());
    // }

    // @Override
    // public TransactionDTO createTransaction(TransactionDTO transactionDTO) {
    
    //     TransactionEntity transaction = TransactionEntity.builder()
    //             .amount(transactionDTO.amount())
    //             .date(transactionDTO.date())
    //             .description(transactionDTO.description())
    //             .build();
    //     transaction = transactionRepository.save(transaction);
    //     transactionDTO = null;
    //     return TransactionDTO.builder()
    //             .amount(transaction.getAmount())
    //             .date(transaction.getDate())
    //             .description(transaction.getDescription())
    //             .id(transaction.getId())
    //             .build();
    // }

    // @Override
    // public TransactionDTO deleteTransactionById(long id) throws TransactionNotFoundException {
    //     TransactionEntity transactionEntity = transactionRepository.findById(id).orElse(null);
    //     if (transactionEntity == null) {
    //         throw new TransactionNotFoundException("Transaction not found with id: " + id);
    //     }
    //     transactionRepository.delete(transactionEntity);
    //     return TransactionDTO.builder()
    //             .amount(transactionEntity.getAmount())
    //             .date(transactionEntity.getDate())
    //             .description(transactionEntity.getDescription())
    //             .id(transactionEntity.getId())
    //             .build();
    // }

    // @Override
    // public TransactionDTO updateTransactionById(long id, TransactionDTO transactionDTO) throws TransactionNotFoundException {
    //     TransactionEntity transactionEntity = transactionRepository.findById(id).orElse(null);
    //     if (transactionEntity == null) {
    //         throw new TransactionNotFoundException("Transaction not found with id: " + id);
    //     }
    //     transactionEntity = transactionRepository.save (transactionEntity);
    //     return TransactionDTO.builder()
    //             .amount(transactionEntity.getAmount())
    //             .date(transactionEntity.getDate())
    //             .description(transactionEntity.getDescription())
    //             .id(transactionEntity.getId())
    //             .build();
    // }

    // @Override
    // public HashMap<String, List<TransactionDTO>> getTransactionsByMonth() throws TransactionNotFoundException {
    //     List<TransactionEntity> transEntity = transactionRepository.findAll();
    //     if (transEntity.isEmpty()) {
    //         throw new TransactionNotFoundException("No transactions found");
    //     }
    //     return transEntity.stream().map(transactionEntity -> {
    //         List<TransactionDTO> transDTOs = new ArrayList<>();
    //         transDTOs.add(TransactionDTO.builder()
    //             .amount(transactionEntity.getAmount())
    //             .date(transactionEntity.getDate())
    //             .description(transactionEntity.getDescription())
    //             .id(transactionEntity.getId())
    //             .build());
    //         return transDTOs;
    //     }).collect(Collectors.toMap( 
    //         transDTO->YearMonth.of(transDTO.get(0).date().getYear(), transDTO.get(0).date().getMonth()).toString(),
    //         transDTO->transDTO,
    //         (existing, replacement) -> {
    //             existing.addAll(replacement);
    //             return existing;
    //         },
    //         HashMap::new

    //     ));
    // }

}
