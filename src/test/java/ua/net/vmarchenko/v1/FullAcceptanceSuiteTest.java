package ua.net.vmarchenko.v1;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ua.net.vmarchenko.v1.categories.Buggy;
import ua.net.vmarchenko.v1.features.TodosE2ETest;
import ua.net.vmarchenko.v1.features.TodosOperationsAtAllFilterTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class})
@Categories.ExcludeCategory(Buggy.class)
public class FullAcceptanceSuiteTest {
}
