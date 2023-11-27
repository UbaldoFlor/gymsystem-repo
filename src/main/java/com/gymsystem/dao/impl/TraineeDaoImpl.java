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

import com.gymsystem.dao.TraineeDao;
import com.gymsystem.models.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	private final Map<Long, Trainee> trainees = new HashMap<>();

    @Override
    public List<Trainee> getAllTrainees() {
        return new ArrayList<>(trainees.values());
    }

    @Override
    public Trainee getTraineeById(long id) {
        return trainees.get(id);
    }

    @Override
    public void createTrainee(Trainee trainee) {
        long id = trainees.size() + 1L;
        trainee.setId(id);
        trainees.put(id, trainee);
    }

    @Override
    public void updateTrainee(Trainee trainee) {
        if (!trainees.containsKey(trainee.getId())) {
            throw new IllegalArgumentException("Trainee with ID " + trainee.getId() + " does not exist");
        }
        trainees.put(trainee.getId(), trainee);
    }

    @Override
    public void deleteTrainee(long id) {
        if (!trainees.containsKey(id)) {
            throw new IllegalArgumentException("Trainee with ID " + id + " does not exist");
        }
        trainees.remove(id);
    }

	@Override
	public List<Trainee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainee> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Trainee> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Trainee> entities) {
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
	public Trainee getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainee getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Trainee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Trainee> findById(Long id) {
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
	public void delete(Trainee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Trainee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Trainee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Trainee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Trainee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
