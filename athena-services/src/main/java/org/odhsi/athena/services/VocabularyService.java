package org.odhsi.athena.services;

import org.odhsi.athena.dto.VocabularyBuildLogDTO;
import org.odhsi.athena.dto.VocabularyStatusDTO;
import org.odhsi.athena.entity.Vocabulary;
import org.odhsi.athena.exceptions.MissingVocabularyAttributeException;
import org.odhsi.athena.exceptions.VocabularyNotFoundException;

import java.util.List;

/**
 * Created by GMalikov on 14.05.2015.
 */
public interface VocabularyService {

    public Vocabulary getById(String id);

    public List<Vocabulary> getAllVocabularies();

    public void buildVocabulary(String id) throws VocabularyNotFoundException, MissingVocabularyAttributeException;

    public List<VocabularyStatusDTO> getAllVocabularyStatuses();

    public List<VocabularyBuildLogDTO> getLogForVocabulary(String vocabularyId, String filter);

}