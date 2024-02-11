package de.telran.lesson20240209summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MicroSearch {
    private final InvertIndex invertIndex = new InvertIndex();
    private final TextSplitter txtSpltr = new TextSplitter();
    private final DocumentIndex documentIndex = new DocumentIndex();

    public List<Document> search(SearchQuery searchQuery) {
        TextSplitter txtSpltr = new TextSplitter();
        List<Word> words = txtSpltr.splitText((searchQuery.getQuery()));
        List<DocumentId> resultDocumentIds = new ArrayList<>();
        boolean isFirstWord = true;
        for (Word word : words) {
            List<DocumentId> documentIds = invertIndex.getDocumentIds(word);
            //if (resultDocumentIds.isEmpty() && isFirstWord) {
                if (isFirstWord) {
                resultDocumentIds = documentIds;
                isFirstWord = false;
            } else {
                resultDocumentIds = merge(documentIds, resultDocumentIds);
            }
        }
        List<Document> documents = new ArrayList<>();
        for (DocumentId documentId : resultDocumentIds) {
            Document document = documentIndex.getDocument(documentId);
            documents.add(document);
        }
        return documents;
    }
    private List<DocumentId> merge(List<DocumentId> documentIds, List<DocumentId> resultDocumentIds) {
        Set<DocumentId> documentIdSet = Set.copyOf(documentIds);
        List<DocumentId> result = new ArrayList<>();
        for (DocumentId documentId : resultDocumentIds) {
            if(documentIdSet.contains(documentId)){
                result.add(documentId);
            }
        }
        //System.out.println(result);
        return result;
    }
//indexirovanie
    public void saveDocument(Document document){
       DocumentId documentId = documentIndex.save(document);
        List<Word> words = txtSpltr.splitText(document.getText());
        invertIndex.save(documentId, words);
    }
    public static void main(String[] args) {
        MicroSearch microSearch = new MicroSearch();
        microSearch.saveDocument(new Document("Tom Soyeer"));
        microSearch.saveDocument(new Document("Tom Johns"));
        microSearch.saveDocument(new Document("Tom Hanks"));
        microSearch.saveDocument(new Document("Green Soyeer"));
        microSearch.saveDocument(new Document("Red Pink"));
        List<Document> docs = microSearch.search(new SearchQuery("Green Red tom"));
        System.out.println(docs);
    }
}
