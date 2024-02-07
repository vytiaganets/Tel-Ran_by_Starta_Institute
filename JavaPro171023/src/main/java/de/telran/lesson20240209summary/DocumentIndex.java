package de.telran.lesson20240209summary;

import java.util.HashMap;
import java.util.Map;

public class DocumentIndex {
    private long lastId = 0;
    private Map<DocumentId, Document> storage = new HashMap<>();
    public Document getDocument(DocumentId documentId){
        return storage.get(documentId);
    }

    public DocumentId save(Document document) {//заполняем документ id
        DocumentId id = new DocumentId(lastId++);
        storage.put(id, document);
        return id;
    }
}
