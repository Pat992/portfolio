import { configureStore } from '@reduxjs/toolkit';

import scrollReducer from './scroll-slice';
import mainReducer from './main-slice';
import projectsReducer from './projects-slice';
import themeReducer from './theme-slice';

const store = configureStore({
    reducer: {
        scroll: scrollReducer,
        projects: projectsReducer,
        theme: themeReducer,
        main: mainReducer,
        // navigation: navigationReducer,
        // skills: skillsReducer,
    }
});

export default store;
export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;