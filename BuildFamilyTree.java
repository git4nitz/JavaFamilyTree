package com.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * This class builds a family tree in the order starting from root=null and then
 * descending into the family graph.
 * 
 * The input graph to decipher the family tree is given as below
 * null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid
 * 
 * @author Nitin Mishra
 *
 */
public class BuildFamilyTree {
	/**
	 * A simple method that accepts the input as family tree in form of a string.
	 * It then decodes the input string to determine the family graph using the FamilyNode
	 * class and then builds a hierarchial tree to denote the 'parent-children' relationship
	 * The input string follows the convention such that the nodes are separated by '|' and the 
	 * parentId, name, and childId are all separted with ','
	 * 
	 * @param str = input string to decode (for e.g "null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid")
	 */
	public void buildTree(String str) {	
		// | is a metacharacter in regex. You'd need to escape it:
	    String[] tokens = str.split("\\|");
	    // Map to store each node against its ID.
	    Map<String,FamilyNode> map = new HashMap<>();
	    FamilyNode root = null;
	    for(String token: tokens){
	        String[] nodeTokens = token.split(",");
	        String id = nodeTokens[1];
	        String parentId = nodeTokens[0];
	        if(parentId.equals("null")){
	            root = new FamilyNode(id,nodeTokens[2],null);
	            map.put(id,root);
	        }
	        else{
	            FamilyNode parent = map.get(parentId);
	            FamilyNode child = new FamilyNode(id,nodeTokens[2],parentId);
	            parent.addChildren(child);
	            map.put(parentId,parent);
	            map.put(id,child);
	        }
	    }//end for loop
	    System.out.println(root);
	}
	
}
