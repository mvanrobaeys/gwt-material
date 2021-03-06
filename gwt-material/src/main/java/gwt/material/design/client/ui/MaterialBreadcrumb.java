package gwt.material.design.client.ui;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import gwt.material.design.client.base.AbstractButton;
import gwt.material.design.client.base.AbstractIconButton;

//@formatter:off

/**
 * Breadcrumbs are a good way to display your current location.
 * This is usually used when you have multiple layers of content.
 * <h3>UiBinder Usage:</h3>
 * <pre>
 * {@code
 * <m:MaterialNavBar backgroundColor="blue">
 *     <m:MaterialBreadcrumb text="First" href="#first"/>
 *     <m:MaterialBreadcrumb text="Second" href="#second"/>
 *     <m:MaterialBreadcrumb text="Third" href="#third"/>
 * </m:MaterialNavBar>
 * }
 * </pre>
 *
 * @author kevzlou7979
 * @see <a href="http://gwt-material-demo.herokuapp.com/#breadcrumbs">Material BreadCrumb</a>
 */
//@formatter:on
public class MaterialBreadcrumb extends AbstractIconButton {

    public MaterialBreadcrumb() {
        setStyleName("breadcrumb");
    }

    @Override
    protected Element createElement() {
        return Document.get().createAnchorElement();
    }

}

