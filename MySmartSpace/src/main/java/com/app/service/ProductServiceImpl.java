/*
 * package com.app.service;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.app.custom_excs.ProductNotFoundException; import
 * com.app.dao.IProductDao; import com.app.pojos.Products;
 * 
 * @Service
 * 
 * @Transactional public class ProductServiceImpl implements IProductService {
 * // dependency
 * 
 * @Autowired private IProductDao dao;
 * 
 * @Override public List<Products> getAllProducts() {
 * System.out.println("dao imple class " + dao.getClass().getName()); return
 * dao.findAll(); }
 * 
 * @Override // search by only one public Optional<Products>
 * getProductDetails(String pName) { // TODO Auto-generated method stub return
 * dao.findByName(pName); }
 * 
 * @Override public Products addProductDetails(Products transientPOJO) { // TODO
 * Auto-generated method stub return dao.save(transientPOJO); }
 * 
 * @Override public Product updateProductDetails(int productId, Products p1) {
 * // chk if product exists : findById Optional<Product> p =
 * dao.findById(productId); if (p.isPresent()) { // p.get() : PERSISTENT // p1 :
 * detached POJO : contains the updates sent by clnt // change state of
 * persistent POJO Product product = p.get(); product.setPrice(p1.getPrice());
 * product.setExpDate(p1.getExpDate()); return product;
 * 
 * } //in case of no product found : throw custom exception throw new
 * ProductNotFoundException("Invalid Product ID");
 * 
 * }
 * 
 * @Override public String deleteProduct(int productId) {
 * 
 * dao.deleteById(productId);
 * 
 * return "Product with Id= "+productId+" deleted"; }
 * 
 * 
 * 
 * }
 */