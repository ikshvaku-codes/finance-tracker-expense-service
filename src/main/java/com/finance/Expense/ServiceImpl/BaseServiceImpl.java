package com.finance.Expense.ServiceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finance.Expense.Repository.BaseRepository;
import com.finance.Expense.Service.BaseService;
import com.finance.Expense.entity.BaseEntity;
import com.finance.Expense.mapper.BaseMapper;

@Service
public abstract class BaseServiceImpl<E extends BaseEntity, DTO  , ID extends Serializable> implements BaseService<DTO, ID>{

    private BaseRepository<E, ID> baseRepository;
    private BaseMapper<E, DTO> baseMapper;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository, BaseMapper<E, DTO> baseMapper) {
        this.baseRepository = baseRepository;
        this.baseMapper = baseMapper;
    }
    @Override
    public boolean deleteById(ID id) {
        E entity = this.baseRepository.findById(id).orElse(null);
        if (entity == null) {
            return false;
        }
        this.baseRepository.delete(entity);
        return true;
        
    }

    @Override
    public List<DTO> findAll() {
        List<E> entities = this.baseRepository.findAll();
        if (entities.isEmpty()) {
            return new ArrayList<DTO>();
        }
        return entities.stream()
                .map(e -> this.baseMapper.toDto(e))
                .toList();
    }

    @Override
    public DTO findById(ID id) {
        E entity = this.baseRepository.findById(id).orElse(null);
        if (entity == null) {
            return null;
        }
        return this.baseMapper.toDto(entity);
    }

    @Override
    public DTO save(DTO dto) {
        try{
            E entity = this.baseMapper.toEntity(dto);
            entity = this.baseRepository.save(entity);
            return this.baseMapper.toDto(entity);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
            
        
        
    }

    @Override
    public DTO update(DTO entity, ID id) {
        E existingEntity = this.baseRepository.findById(id).orElse(null);
        if (existingEntity == null) {
            return null;
        }
        E updatedEntity = this.baseMapper.toEntity(entity);
        updatedEntity.setId(id); 
        updatedEntity = this.baseRepository.save(updatedEntity);
        return this.baseMapper.toDto(updatedEntity);
    }

}
