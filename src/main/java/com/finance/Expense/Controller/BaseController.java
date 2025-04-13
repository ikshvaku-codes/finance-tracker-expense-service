package com.finance.Expense.Controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.finance.Expense.DTO.APIResponse;
import com.finance.Expense.DTO.BaseDTO;
import com.finance.Expense.Service.BaseService;

@RestController
public abstract class BaseController<DTO extends BaseDTO> {
    private final BaseService<DTO, Long> service; // Injecting the Generic Service

    protected BaseController(BaseService<DTO, Long> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<APIResponse<DTO>> save(@RequestBody DTO dto) {
        DTO returnDTO =  service.save(dto);
        if(returnDTO == null){
            return ResponseEntity
                    .badRequest()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(APIResponse.<DTO>builder()
                            .message("Error while saving the entity")
                            .status(HttpStatus.BAD_REQUEST.value())
                            .data(dto)
                            .metadata(null)
                            .build());
        }
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(APIResponse.<DTO>builder()
                        .message("Entity created successfully")
                        .status(HttpStatus.CREATED.value())
                        .data(returnDTO)
                        .metadata("Timestamp: " + System.currentTimeMillis()+" | ID: " + returnDTO.getId())
                        .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<DTO>> findById(@PathVariable Long id) {
        DTO dto = service.findById(id); 
        if (dto == null){
        return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(APIResponse.<DTO>builder()
                            .message("Error while saving the entity")
                            .status(HttpStatus.NO_CONTENT.value())
                            .data(null)
                            .metadata(null)
                            .build());
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(APIResponse.<DTO>builder()
                        .message("Entity created successfully")
                        .status(HttpStatus.OK.value())
                        .data(dto)
                        .metadata("Timestamp: " + System.currentTimeMillis()+" | ID: " + dto.getId())
                        .build());
    }
    

    @GetMapping
    public ResponseEntity<APIResponse<List<DTO>>> findAll() {
        List<DTO> dtos = service.findAll(); 
        if (dtos.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(APIResponse.<List<DTO>>builder()
                            .message("No entities found")
                            .status(HttpStatus.NO_CONTENT.value())
                            .data(dtos)
                            .metadata(null)
                            .build());
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(APIResponse.<List<DTO>>builder()
                        .message("Entities fetched successfully")
                        .status(HttpStatus.OK.value())
                        .data(dtos)
                        .metadata("Timestamp: " + System.currentTimeMillis())
                        .build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<Boolean>> deleteById(@PathVariable Long id) {
        boolean isDeleted = service.deleteById(id) ;
        if (!isDeleted) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(APIResponse.<Boolean>builder()
                            .message("Entity not found")
                            .status(HttpStatus.NOT_FOUND.value())
                            .data(isDeleted)
                            .metadata(null)
                            .build());
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(APIResponse.<Boolean>builder()
                        .message("Entity deleted successfully")
                        .status(HttpStatus.OK.value())
                        .data(isDeleted)
                        .metadata("Timestamp: " + System.currentTimeMillis())
                        .build());
    }

}
