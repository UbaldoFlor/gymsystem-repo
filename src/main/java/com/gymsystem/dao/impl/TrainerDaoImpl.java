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

import com.gymsystem.dao.TrainerDao;
import com.gymsystem.models.Trainer;

@Repository
public class TrainerDaoImpl implements TrainerDao {

    private final Map<Long, Trainer> trainers = new HashMap<>();

    @Override
    public List<Trainer> getAllTrainers() {
        return new ArrayList<>(trainers.values());
    }

    @Override
    public Trainer getTrainerById(long id) {
        return trainers.get(id);
    }

    @Override
    public void createTrainer(Trainer trainer) {
        long id = trainers.size() + 1L;
        trainer.setId(id);
        trainers.put(id, trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        if (!trainers.containsKey(trainer.getId())) {
            throw new IllegalArgumentException("Trainer with ID " + trainer.getId() + " does not exist");
        }
        trainers.put(trainer.getId(), trainer);
    }

    @Override
    public void deleteTrainer(long id) {
        if (!trainers.containsKey(id)) {
            throw new IllegalArgumentException("Trainer with ID " + id + " does not exist");
        }
        trainers.remove(id);
    }

	@Override
	public List<Trainer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Trainer> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Trainer> entities) {
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
	public Trainer getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainer getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Trainer> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Trainer> findById(Long id) {
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
	public void delete(Trainer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Trainer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Trainer> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Trainer> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Trainer> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Trainer> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}