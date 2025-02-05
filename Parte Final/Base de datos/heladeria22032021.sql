PGDMP     5                    y         	   heladeria    12.3    12.3 1    Q           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            R           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            S           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            T           1262    20011 	   heladeria    DATABASE     �   CREATE DATABASE heladeria WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
    DROP DATABASE heladeria;
                postgres    false            �            1259    20012    sec_id_categoria    SEQUENCE     y   CREATE SEQUENCE public.sec_id_categoria
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.sec_id_categoria;
       public          postgres    false            �            1259    20014    categoria_helado    TABLE     �   CREATE TABLE public.categoria_helado (
    id_categoria character(20) DEFAULT nextval('public.sec_id_categoria'::regclass) NOT NULL,
    nombre_categoria character(100),
    descripcion character(250),
    estado boolean
);
 $   DROP TABLE public.categoria_helado;
       public         heap    postgres    false    202            �            1259    20018    sec_id_cliente    SEQUENCE     w   CREATE SEQUENCE public.sec_id_cliente
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.sec_id_cliente;
       public          postgres    false            �            1259    20020    cliente    TABLE     T  CREATE TABLE public.cliente (
    id_cliente character(30) DEFAULT nextval('public.sec_id_cliente'::regclass) NOT NULL,
    nombre_cliente character(30),
    apellido_cliente character(30),
    ci character(30),
    direccion_cliente character(30),
    email_cliente character(30),
    telefono_cliente character(30),
    estado boolean
);
    DROP TABLE public.cliente;
       public         heap    postgres    false    204            �            1259    20024    cliente_id_cliente    SEQUENCE     {   CREATE SEQUENCE public.cliente_id_cliente
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.cliente_id_cliente;
       public          postgres    false            �            1259    20026    sec_id_detalle_ingreso    SEQUENCE        CREATE SEQUENCE public.sec_id_detalle_ingreso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.sec_id_detalle_ingreso;
       public          postgres    false            �            1259    20028    detalle_ingreso    TABLE       CREATE TABLE public.detalle_ingreso (
    id_detalle_ingreso character(20) DEFAULT nextval('public.sec_id_detalle_ingreso'::regclass) NOT NULL,
    id_ingreso character(20),
    id_helado character(20),
    cantidad character(20),
    precio character(30)
);
 #   DROP TABLE public.detalle_ingreso;
       public         heap    postgres    false    207            �            1259    20032    detalle_venta    TABLE     �   CREATE TABLE public.detalle_venta (
    id_venta character varying(20),
    id_helado character varying(20),
    cantidad character(30),
    subtotal character(20),
    descuento character(20),
    id_detalle_venta bigint NOT NULL
);
 !   DROP TABLE public.detalle_venta;
       public         heap    postgres    false            �            1259    20038 "   detalle_venta_id_detalle_venta_seq    SEQUENCE     �   CREATE SEQUENCE public.detalle_venta_id_detalle_venta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 9   DROP SEQUENCE public.detalle_venta_id_detalle_venta_seq;
       public          postgres    false    209            U           0    0 "   detalle_venta_id_detalle_venta_seq    SEQUENCE OWNED BY     i   ALTER SEQUENCE public.detalle_venta_id_detalle_venta_seq OWNED BY public.detalle_venta.id_detalle_venta;
          public          postgres    false    210            �            1259    20040    sec_id_articulo    SEQUENCE     x   CREATE SEQUENCE public.sec_id_articulo
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.sec_id_articulo;
       public          postgres    false            �            1259    20042    helado    TABLE     K  CREATE TABLE public.helado (
    id_helado character(15) DEFAULT nextval('public.sec_id_articulo'::regclass) NOT NULL,
    id_categoria character(20),
    nombre_helado character varying(200),
    precio_venta character(20),
    stock character(15),
    descripcion character(200),
    imagen character(250),
    estado boolean
);
    DROP TABLE public.helado;
       public         heap    postgres    false    211            �            1259    20049    sec_id_ingreso    SEQUENCE     w   CREATE SEQUENCE public.sec_id_ingreso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.sec_id_ingreso;
       public          postgres    false            �            1259    20051    ingreso    TABLE     �   CREATE TABLE public.ingreso (
    id_ingreso character(20) DEFAULT nextval('public.sec_id_ingreso'::regclass) NOT NULL,
    proveedor character(20),
    fecha character(20),
    total character(50),
    comprobante character(20)
);
    DROP TABLE public.ingreso;
       public         heap    postgres    false    213            �            1259    20055    sec_id_venta    SEQUENCE     u   CREATE SEQUENCE public.sec_id_venta
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.sec_id_venta;
       public          postgres    false            �            1259    20057    venta    TABLE     L  CREATE TABLE public.venta (
    id_venta character varying DEFAULT nextval('public.sec_id_venta'::regclass) NOT NULL,
    fecha_venta character varying,
    id_cliente character varying,
    forma_pago character varying,
    iva character varying,
    total character varying,
    descuento character varying,
    estado boolean
);
    DROP TABLE public.venta;
       public         heap    postgres    false    215            �
           2604    20064    detalle_venta id_detalle_venta    DEFAULT     �   ALTER TABLE ONLY public.detalle_venta ALTER COLUMN id_detalle_venta SET DEFAULT nextval('public.detalle_venta_id_detalle_venta_seq'::regclass);
 M   ALTER TABLE public.detalle_venta ALTER COLUMN id_detalle_venta DROP DEFAULT;
       public          postgres    false    210    209            A          0    20014    categoria_helado 
   TABLE DATA           _   COPY public.categoria_helado (id_categoria, nombre_categoria, descripcion, estado) FROM stdin;
    public          postgres    false    203   �<       C          0    20020    cliente 
   TABLE DATA           �   COPY public.cliente (id_cliente, nombre_cliente, apellido_cliente, ci, direccion_cliente, email_cliente, telefono_cliente, estado) FROM stdin;
    public          postgres    false    205   =       F          0    20028    detalle_ingreso 
   TABLE DATA           f   COPY public.detalle_ingreso (id_detalle_ingreso, id_ingreso, id_helado, cantidad, precio) FROM stdin;
    public          postgres    false    208   �=       G          0    20032    detalle_venta 
   TABLE DATA           m   COPY public.detalle_venta (id_venta, id_helado, cantidad, subtotal, descuento, id_detalle_venta) FROM stdin;
    public          postgres    false    209   >       J          0    20042    helado 
   TABLE DATA           z   COPY public.helado (id_helado, id_categoria, nombre_helado, precio_venta, stock, descripcion, imagen, estado) FROM stdin;
    public          postgres    false    212   �>       L          0    20051    ingreso 
   TABLE DATA           S   COPY public.ingreso (id_ingreso, proveedor, fecha, total, comprobante) FROM stdin;
    public          postgres    false    214   9?       N          0    20057    venta 
   TABLE DATA           m   COPY public.venta (id_venta, fecha_venta, id_cliente, forma_pago, iva, total, descuento, estado) FROM stdin;
    public          postgres    false    216   V?       V           0    0    cliente_id_cliente    SEQUENCE SET     A   SELECT pg_catalog.setval('public.cliente_id_cliente', 1, false);
          public          postgres    false    206            W           0    0 "   detalle_venta_id_detalle_venta_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.detalle_venta_id_detalle_venta_seq', 32, true);
          public          postgres    false    210            X           0    0    sec_id_articulo    SEQUENCE SET     =   SELECT pg_catalog.setval('public.sec_id_articulo', 5, true);
          public          postgres    false    211            Y           0    0    sec_id_categoria    SEQUENCE SET     >   SELECT pg_catalog.setval('public.sec_id_categoria', 6, true);
          public          postgres    false    202            Z           0    0    sec_id_cliente    SEQUENCE SET     <   SELECT pg_catalog.setval('public.sec_id_cliente', 5, true);
          public          postgres    false    204            [           0    0    sec_id_detalle_ingreso    SEQUENCE SET     E   SELECT pg_catalog.setval('public.sec_id_detalle_ingreso', 1, false);
          public          postgres    false    207            \           0    0    sec_id_ingreso    SEQUENCE SET     =   SELECT pg_catalog.setval('public.sec_id_ingreso', 1, false);
          public          postgres    false    213            ]           0    0    sec_id_venta    SEQUENCE SET     :   SELECT pg_catalog.setval('public.sec_id_venta', 2, true);
          public          postgres    false    215            �
           2606    20066    cliente Cliente_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY (id_cliente);
 @   ALTER TABLE ONLY public.cliente DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    205            �
           2606    20068    helado articulo_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.helado
    ADD CONSTRAINT articulo_pkey PRIMARY KEY (id_helado);
 >   ALTER TABLE ONLY public.helado DROP CONSTRAINT articulo_pkey;
       public            postgres    false    212            �
           2606    20070    categoria_helado categoria_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.categoria_helado
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id_categoria);
 I   ALTER TABLE ONLY public.categoria_helado DROP CONSTRAINT categoria_pkey;
       public            postgres    false    203            �
           2606    20072 $   detalle_ingreso detalle_ingreso_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.detalle_ingreso
    ADD CONSTRAINT detalle_ingreso_pkey PRIMARY KEY (id_detalle_ingreso);
 N   ALTER TABLE ONLY public.detalle_ingreso DROP CONSTRAINT detalle_ingreso_pkey;
       public            postgres    false    208            �
           2606    20074     detalle_venta detalle_venta_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_venta_pkey PRIMARY KEY (id_detalle_venta);
 J   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_venta_pkey;
       public            postgres    false    209            �
           2606    20076    venta factura_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT factura_pkey PRIMARY KEY (id_venta);
 <   ALTER TABLE ONLY public.venta DROP CONSTRAINT factura_pkey;
       public            postgres    false    216            �
           2606    20078    ingreso ingreso_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.ingreso
    ADD CONSTRAINT ingreso_pkey PRIMARY KEY (id_ingreso);
 >   ALTER TABLE ONLY public.ingreso DROP CONSTRAINT ingreso_pkey;
       public            postgres    false    214            �
           2606    20121 .   detalle_venta detalle_factura_id_articulo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_factura_id_articulo_fkey FOREIGN KEY (id_helado) REFERENCES public.helado(id_helado) NOT VALID;
 X   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_factura_id_articulo_fkey;
       public          postgres    false    212    2743    209            �
           2606    20130 -   detalle_venta detalle_factura_id_factura_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_factura_id_factura_fkey FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta) NOT VALID;
 W   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_factura_id_factura_fkey;
       public          postgres    false    209    216    2747            �
           2606    20089 /   detalle_ingreso detalle_ingreso_id_ingreso_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_ingreso
    ADD CONSTRAINT detalle_ingreso_id_ingreso_fkey FOREIGN KEY (id_ingreso) REFERENCES public.ingreso(id_ingreso) NOT VALID;
 Y   ALTER TABLE ONLY public.detalle_ingreso DROP CONSTRAINT detalle_ingreso_id_ingreso_fkey;
       public          postgres    false    2745    214    208            �
           2606    20094     helado factura_id_categoria_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.helado
    ADD CONSTRAINT factura_id_categoria_fkey FOREIGN KEY (id_categoria) REFERENCES public.categoria_helado(id_categoria) NOT VALID;
 J   ALTER TABLE ONLY public.helado DROP CONSTRAINT factura_id_categoria_fkey;
       public          postgres    false    2735    212    203            �
           2606    20099    venta factura_id_cliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT factura_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente) NOT VALID;
 G   ALTER TABLE ONLY public.venta DROP CONSTRAINT factura_id_cliente_fkey;
       public          postgres    false    205    2737    216            �
           2606    20104 ,   detalle_ingreso fk_detalle_ingreso_id_helado    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_ingreso
    ADD CONSTRAINT fk_detalle_ingreso_id_helado FOREIGN KEY (id_helado) REFERENCES public.helado(id_helado);
 V   ALTER TABLE ONLY public.detalle_ingreso DROP CONSTRAINT fk_detalle_ingreso_id_helado;
       public          postgres    false    208    2743    212            A   �   x�͓=
�0Fgs
O Կ�R�H��R�o\���1�_���/��k�R�ށ�*�t�F4�"�*�֐؄�OhnE�Uʭ!�	g��sBY���&�}�3AY���&�}E���{.w8�n�M8�6�5�      C   �   x�Œ��0E��W�����@Х	[3B$<LS�����eF�����yU
J,O����r�Qxm�2�c8ٚ�Tm� Ӫ��8�=4G@�{~.�xޝC��F��0t���)����]�n�}���A
CU�x��Vzv�ˈ(n�6����q�0��	f�ڵE��p򪂉����M>�����;M���R�Q�b�����d�M�h{�s~>"�'      F      x������ � �      G   �   x����� �r��&��&R��q�Q����!�����(Gv EJ����'����9�Hy�`_iT�])�ӈ���&|���?O������bZ��.w�ӄ[m8b����ߣ�/L���n]�Te�͏�� ^V      J   �   x�3T@�F
��3#5'��T�gq
`�b �.4_rcS	
#NS��� H�� � 1�.5�$��M��JH�`��jQj1-Ho I!h����JP������&%���&>$`b���� 2��&      L      x������ � �      N   +   x�3�42�70�7202�4��C�.CN#}��	�\� u�     