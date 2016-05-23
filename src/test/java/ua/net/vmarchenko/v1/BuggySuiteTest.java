package ua.net.vmarchenko.v1;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ua.net.vmarchenko.v1.categories.Buggy;
import ua.net.vmarchenko.v1.features.TodosOperationsAtAllFilterTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({TodosOperationsAtAllFilterTest.class, TodosOperationsAtAllFilterTest.class})
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}
