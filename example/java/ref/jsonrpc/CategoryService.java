package com.daigou.sg.rpc.category;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.common.utils.JsonUtils;
import com.daigou.sg.app.DgApplication;
import com.daigou.sg.rpc.BaseModule;
import com.daigou.sg.rpc.GsonUtils;
import com.daigou.sg.rpc.RpcRequest;
import com.daigou.sg.app.AppUrl;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
public class CategoryService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private CategoryService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public RpcRequest GetAllProductCount(final int id, final String originCode, final Listener<Integer> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Integer result;
                        result = BaseModule.fromJSON(response, Integer.class);

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(id);
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetAllProductCount");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetHomePageCategories(final int offset, final int limit, final String originCode, final Listener<ArrayList<TCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TCategory> result;
                        result = BaseModule.fromJSONArray(response, new TCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(offset);
                params.add(limit);
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetHomePageCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetPrimeFloorCategories(final Listener<ArrayList<TFloorCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TFloorCategory> result;
                        result = BaseModule.fromJSONArray(response, new TFloorCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetPrimeFloorCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetPrimeProducts(final int id, final int offset, final int limit, final Listener<ArrayList<TProductSimple>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TProductSimple> result;
                        result = BaseModule.fromJSONArray(response, new TProductSimple.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(id);
                params.add(offset);
                params.add(limit);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetPrimeProducts");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetPrimeSubCategories(final int categoryId, final Listener<ArrayList<TCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TCategory> result;
                        result = BaseModule.fromJSONArray(response, new TCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(categoryId);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetPrimeSubCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetPrimeTopLevelCategories(final Listener<ArrayList<TCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TCategory> result;
                        result = BaseModule.fromJSONArray(response, new TCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetPrimeTopLevelCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetProducts(final int id, final int offset, final int limit, final String originCode, final Listener<ArrayList<TProductSimple>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TProductSimple> result;
                        result = BaseModule.fromJSONArray(response, new TProductSimple.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(id);
                params.add(offset);
                params.add(limit);
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetProducts");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetSubCategories(final int categoryId, final Listener<ArrayList<TCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TCategory> result;
                        result = BaseModule.fromJSONArray(response, new TCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(categoryId);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetSubCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest GetTopLevelCategories(final String originCode, final Listener<ArrayList<TCategory>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TCategory> result;
                        result = BaseModule.fromJSONArray(response, new TCategory.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.GetTopLevelCategories");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest SearchCategoryProducts(final String keyword, final int offset, final int limit, final int categoryId, final String originCode, final Listener<ArrayList<TProductSimple>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TProductSimple> result;
                        result = BaseModule.fromJSONArray(response, new TProductSimple.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(keyword);
                params.add(offset);
                params.add(limit);
                params.add(categoryId);
                params.add(originCode);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.SearchCategoryProducts");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest UserGetRecentPrimePurchaseDetail(final int paymentBillId, final int offset, final int limit, final Listener<TRecentPrimePurchase> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        TRecentPrimePurchase result;
                        result = BaseModule.fromJSON(response, new TRecentPrimePurchase.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(paymentBillId);
                params.add(offset);
                params.add(limit);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.UserGetRecentPrimePurchaseDetail");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest UserGetRecentPrimePurchaseList(final int offset, final int limit, final Listener<ArrayList<TRecentPrimePurchase>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TRecentPrimePurchase> result;
                        result = BaseModule.fromJSONArray(response, new TRecentPrimePurchase.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(offset);
                params.add(limit);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.UserGetRecentPrimePurchaseList");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }

    public RpcRequest UserGetRecentPrimePurchaseSummaryList(final int offset, final int limit, final Listener<ArrayList<TRecentPrimeCustomer>> listener) {
        RpcRequest req = new RpcRequest(Request.Method.POST, AppUrl.kJsonRpcCoreUrl,
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        ArrayList<TRecentPrimeCustomer> result;
                        result = BaseModule.fromJSONArray(response, new TRecentPrimeCustomer.getTClass());

                        listener.onResponse(result);
                    } catch (Exception ex) {
                        Log.d("ex", ex.toString());
                        Log.d("jsonObject", response);
                        listener.onResponse(null);
                    }
                }
            }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(null);
            }
        }) {
            @Override
            public byte[] getBody() {
                final ArrayList<Object> params = new ArrayList<>();
                params.add(offset);
                params.add(limit);

                HashMap<String, Object> msg = new HashMap<>();
                msg.put("id", getMsgID());
                msg.put("method", "Category.UserGetRecentPrimePurchaseSummaryList");
                msg.put("params", params);

                return gson.toJson(msg).getBytes(Charset.forName("UTF-8"));
            }
        };
        DgApplication.getQueue().add(req);
    }
}
