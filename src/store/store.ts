import { configureStore } from '@reduxjs/toolkit';

import documentReducer from './document-slice';
import mainReducer from './main-slice';
import projectsReducer from './projects-slice';
import themeReducer from './theme-slice';
import footerReducer from './footer-slice';
import modalReducer from './modal-slice';
import navigationReducer from './navigation-slice';

const store = configureStore({
    reducer: {
        doc: documentReducer,
        projects: projectsReducer,
        theme: themeReducer,
        main: mainReducer,
        footer: footerReducer,
        modal: modalReducer,
        navigation: navigationReducer,
        // navigation: navigationReducer,
        // skills: skillsReducer,
    }
});

export default store;
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;