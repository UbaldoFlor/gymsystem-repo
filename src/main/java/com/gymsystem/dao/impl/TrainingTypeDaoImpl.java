package com.gymsystem.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.gymsystem.dao.TrainingTypeDao;
import com.gymsystem.models.TrainingType;

@Repository
public class TrainingTypeDaoImpl implements TrainingTypeDao {

    private final Map<Long, TrainingType> trainingTypes = new HashMap<>();

    @Override
    public List<TrainingType> getAllTrainingTypes() {
        return new ArrayList<>(trainingTypes.values());
    }

    @Override
    public TrainingType getTrainingTypeById(long id) {
        return trainingTypes.get(id);
    }

    @Override
    public void createTrainingType(TrainingType trainingType) {
        long id = trainingTypes.size() + 1L;
        trainingType.setId(id);
        trainingTypes.put(id, trainingType);
    }

    @Override
    public void updateTrainingType(TrainingType trainingType) {
        if (!trainingTypes.containsKey(trainingType.getId())) {
            throw new IllegalArgumentException("TrainingType with ID " + trainingType.getId() + " does not exist");
        }
        trainingTypes.put(trainingType.getId(), trainingType);
    }

    @Override
    public void deleteTrainingType(long id) {
        if (!trainingTypes.containsKey(id)) {
            throw new IllegalArgumentException("TrainingType with ID " + id + " does not exist");
        }
        trainingTypes.remove(id);
    }

	@Override
	public List<TrainingType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingType> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TrainingType> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TrainingType> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<TrainingType> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingType getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TrainingType getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TrainingType> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TrainingType> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TrainingType entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TrainingType> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TrainingType> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends TrainingType> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TrainingType> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TrainingType> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}