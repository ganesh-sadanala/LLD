package Utils;
import java.util.*;

class InvertedIndex{
  Map<String, List<Integer>> nameIndex;
  Map<String, List<Integer>> categoryIndex;
  Map<String, List<Integer>> priceRangeIndex;

  public InvertedIndex(){
    nameIndex = new HashMap<>();
    categoryIndex = new HashMap<>();
    priceRangeIndex = new HashMap<>();
  }

  public void buildIndex(List<Product> products){
    for(Product product: products){
      addToIndex(nameIndex, product.name, product.id);
      addToIndex(categoryIndex, product.category, product.id);
      addToIndex(priceRangeIndex, product.priceRange, product.id)
    }
  }

  private void addToIndex(Map<String, List<Integer>> index, String key, int productId) {
      index.putIfAbsent(key, new ArrayList<>());
      index.get(key).add(productId);
  }

  public List<Integer> searchByName(String name) {
        return nameIndex.getOrDefault(name, Collections.emptyList());
    }

    public List<Integer> searchByCategory(String category) {
        return categoryIndex.getOrDefault(category, Collections.emptyList());
    }

    public List<Integer> searchByPriceRange(String priceRange) {
        return priceRangeIndex.getOrDefault(priceRange, Collections.emptyList());
    }

    public List<Integer> searchByMultipleAttributes(String name, String category, String priceRange) {
          List<Integer> nameResults = searchByName(name);
          List<Integer> categoryResults = searchByCategory(category);
          List<Integer> priceRangeResults = searchByPriceRange(priceRange);
  
          Set<Integer> intersectionResults = new HashSet<>(nameResults);
          intersectionResults.retainAll(categoryResults);
          intersectionResults.retainAll(priceRangeResults);
  
          return new ArrayList<>(intersectionResults);
      }
}
