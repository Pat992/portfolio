import { configureStore } from '@reduxjs/toolkit';

import documentReducer from './document-slice';
import mainReducer from './main-slice';
import projectsReducer from './projects-slice';
import themeReducer from './theme-slice';
import footerReducer from './footer-slice';

const store = configureStore({
    reducer: {
        doc: documentReducer,
        projects: projectsReducer,
        theme: themeReducer,
        main: mainReducer,
        footer: footerReducer
        // navigation: navigationReducer,
        // skills: skillsReducer,
    }
});

export default store;
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;