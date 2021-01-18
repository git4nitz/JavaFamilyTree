package com.java.test;

/**
 * Simple class to build a sample tree using BuildFamilyTree
 * @author Nitin Mishra
 *
 */
public class BuildSampleTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "null,0,grandpa|0,1,son|0,2,daugther|1,3,grandkid|1,4,grandkid|2,5,grandkid|5,6,greatgrandkid";
		BuildFamilyTree familyTree = new BuildFamilyTree();
		familyTree.buildTree(str);
	}

}
