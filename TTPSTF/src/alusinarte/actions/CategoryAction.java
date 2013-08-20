package alusinarte.actions;

import org.apache.struts2.convention.annotation.Action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Result;

import alusinarte.classes.Category;
import alusinarte.dao.impl.hibernate.CategoryDAOHibernate;
import alusinarte.dao.impl.hibernate.EventDAOHibernate;
import alusinarte.dao.impl.hibernate.FactoryDAOHibernate;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CategoryAction extends ActionSupport implements ModelDriven<Category> {

	private static final long serialVersionUID = 1L;
	
	private Map categorias;
	private Category cat=new Category();
	private CategoryDAOHibernate catDAO=new CategoryDAOHibernate();
	private long catId;
	
	@Override
	public Category getModel() {
		return cat;
	}
	
	//MENSAJES PARA AGREGAR CATEGORIAS
	
	@Action(value = "addCategoryView", 
		    results = {@Result(name="success", location="/addCategory.jsp")})	

	public String addView(){
		return SUCCESS;
	}

	@Action(value="addCategory", 
		    results={@Result(name="success", location="/index.jsp"),
					@Result(name = "input", location = "/addEvent.jsp") }
		  )	
	public String add() {
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		this.catDAO.addCategory(this.getModel());
		return SUCCESS;
	}
	
	
	//MENSAJES PARA MODIFICAR CATEGORIAS
	
	@Action(value="modCategoryView", 
			results={@Result(name="success", location="/modCategory.jsp")}
			)	
	
	public String modView(){
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		setCategorias(this.catDAO.getCategories());
		return SUCCESS;
	}
		
	@Action(value="modCategory", 
			results={@Result(name="success", location="/modCategoryViewData.jsp")}
			)	
		
	public String mod(){
		long id=getCatId();
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		this.cat=this.catDAO.getCategory(id);
		return SUCCESS;
	}
	
	private long idCategoria;
	@Action(value="modCategoryData", 
			 results={@Result(name="success", location="/index.jsp")}
		 )	
		
	public String modificar(){
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		this.catDAO.modCategory(this.getModel(),this.getIdCategoria());
		System.out.println("hola");
		return SUCCESS;
	}	
	
	//MENSAJES PARA ELIMINAR CATEGORIAS
	
	@Action(value="delCategoryView", 
			results={@Result(name="success", location="/delCategory.jsp")}
		 )	
		
	public String delView(){
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		setCategorias(this.catDAO.getCategories());
		return SUCCESS;
	}
		
		
	@Action(value="delCategory", 
			results={@Result(name="success", location="/index.jsp"),
			@Result(name = "input", location = "/delCategory.jsp") }
			 )	
	
	public String del(){
		long id=getCatId();
		this.catDAO = (CategoryDAOHibernate) FactoryDAOHibernate.getCategory();
		this.catDAO.delCategory(id);
		return SUCCESS;
	}
	
	
	
	

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public CategoryDAOHibernate getCatDAO() {
		return catDAO;
	}

	public void setCatDAO(CategoryDAOHibernate catDAO) {
		this.catDAO = catDAO;
	}

	public Map getCategorias() {
		return categorias;
	}

	public void setCategorias(Map categorias) {
		this.categorias = categorias;
	}

	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

}
