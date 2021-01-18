package com.java.test;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a simple POJO that represent a family node that consists
 * of ParentId, NodeId, Name and list of Children Nodes
 * 
 * @author Nitin Mishra
 *
 */
public class FamilyNode {
	 public String id;
	    public String name;
	    public String  parentId;
	    public List<FamilyNode> children = new ArrayList<>();
	    public FamilyNode(String id, String name, String parentId){
	        this.id = id;
	        this.name = name;
	        this.parentId = parentId;
	    }
	    public List<FamilyNode> getChildren() {
	        return children;
	    }
	    public void setChildren(List<FamilyNode> children) {
	        this.children = children;
	    }
	    public void addChildren(FamilyNode children){
	        if(!this.children.contains(children))
	            this.children.add(children);
	    }
	    @Override
	    public String toString() {
	        return "FamilyNode [Id=" + id + ", name=" + name + ", parentId="
	                + parentId + ", childrenItems=" + children + "]";
	    }
}
