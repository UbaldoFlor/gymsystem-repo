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

import com.gymsystem.dao.TrainingDao;
import com.gymsystem.models.Training;

@Repository
public class TrainingDaoImpl implements TrainingDao {

    private final Map<Long, Training> trainings = new HashMap<>();

    @Override
    public List<Training> getAllTrainings() {
        return new ArrayList<>(trainings.values());
    }

    @Override
    public Training getTrainingById(long id) {
        return trainings.get(id);
    }

    @Override
    public void createTraining(Training training) {
        long id = trainings.size() + 1L;
        training.setId(id);
        trainings.put(id, training);
    }

    @Override
    public void updateTraining(Training training) {
        if (!trainings.containsKey(training.getId())) {
            throw new IllegalArgumentException("Training with ID " + training.getId() + " does not exist");
        }
        trainings.put(training.getId(), training);
    }

    @Override
    public void deleteTraining(long id) {
        if (!trainings.containsKey(id)) {
            throw new IllegalArgumentException("Training with ID " + id + " does not exist");
        }
        trainings.remove(id);
    }

	@Override
	public List<Training> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Training> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Training> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Training> entities) {
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
	public Training getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Training getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Training> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Training> findById(Long id) {
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
	public void delete(Training entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Training> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Training> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Training> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Training> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Training> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}