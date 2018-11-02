
package android.databinding;
import com.gmail.superarch.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.gmail.superarch.R.layout.person_item:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/person_item_0".equals(tag)) {
                            return new com.gmail.superarch.databinding.PersonItemBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for person_item is invalid. Received: " + tag);
                }
                case com.gmail.superarch.R.layout.activity_person:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_person_0".equals(tag)) {
                            return new com.gmail.superarch.databinding.ActivityPersonBindingImpl(bindingComponent, view);
                    }
                    if ("layout-land/activity_person_0".equals(tag)) {
                            return new com.gmail.superarch.databinding.ActivityPersonBindingLandImpl(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_person is invalid. Received: " + tag);
                }
                case com.gmail.superarch.R.layout.fragment_student_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_student_list_0".equals(tag)) {
                            return new com.gmail.superarch.databinding.FragmentStudentListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_student_list is invalid. Received: " + tag);
                }
                case com.gmail.superarch.R.layout.fragment_student_details:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_student_details_0".equals(tag)) {
                            return new com.gmail.superarch.databinding.FragmentStudentDetailsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_student_details is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -2078661623: {
                if(tag.equals("layout/person_item_0")) {
                    return com.gmail.superarch.R.layout.person_item;
                }
                break;
            }
            case -343855791: {
                if(tag.equals("layout/activity_person_0")) {
                    return com.gmail.superarch.R.layout.activity_person;
                }
                break;
            }
            case -3736619: {
                if(tag.equals("layout-land/activity_person_0")) {
                    return com.gmail.superarch.R.layout.activity_person;
                }
                break;
            }
            case 624433469: {
                if(tag.equals("layout/fragment_student_list_0")) {
                    return com.gmail.superarch.R.layout.fragment_student_list;
                }
                break;
            }
            case 247261765: {
                if(tag.equals("layout/fragment_student_details_0")) {
                    return com.gmail.superarch.R.layout.fragment_student_details;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}